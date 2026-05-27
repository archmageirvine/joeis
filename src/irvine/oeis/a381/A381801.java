package irvine.oeis.a381;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A381801 Irregular triangle read by rows: row n lists the residues r mod n of numbers k such that rad(k) | n, where rad = A007947.
 * @author Sean A. Irvine
 */
public class A381801 extends Sequence1 {

  private long mN = 0;
  private int mM = 0;
  private Z[] mRow = {};

  private static void build(final TreeSet<Z> res, final ArrayList<Z[]> lists,  final int k, final Z prod, final Z mod) {
    if (k >= lists.size()) {
      res.add(prod.mod(mod));
      return;
    }
    for (final Z v : lists.get(k)) {
      build(res, lists, k + 1, prod.multiply(v), mod);
    }
  }

  /**
   * Construct a row of A391801.
   * @param n row number
   * @return array
   */
  public static Z[] row(final long n) {
    final Z modulus = Z.valueOf(n);

    // Build the lists of powers modulo n for each distinct prime divisor.
    final ArrayList<Z[]> lists = new ArrayList<>();
    for (final Z p : Jaguar.factor(n).toZArray()) {
      final ArrayList<Z> cycle = new ArrayList<>();
      final TreeSet<Z> seen = new TreeSet<>();
      Z t = Z.ONE;
      while (seen.add(t)) {
        cycle.add(t);
        t = t.modMultiply(p, modulus);
      }
      lists.add(cycle.toArray(Z[]::new));
    }

    // Tensor product via recursive product accumulation.
    final TreeSet<Z> res = new TreeSet<>();
    build(res, lists, 0, Z.ONE, modulus);
    return res.toArray(Z[]::new);
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mRow = row(++mN);
      mM = 0;
    }
    return mRow[mM];
  }
}
