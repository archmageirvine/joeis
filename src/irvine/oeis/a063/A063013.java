package irvine.oeis.a063;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A063013 Numbers where k-th digit from right is either 0 or k.
 * @author Sean A. Irvine
 */
public class A063013 extends FiniteSequence {

  private static TreeSet<Z> build() {
    final TreeSet<Z> res = new TreeSet<>();
    long v = 0;
    build(res, v, 1, 1);
    return res;
  }

  private static void build(final TreeSet<Z> res, final long v, final long digit, final long powerOfTen) {
    res.add(Z.valueOf(v));
    final long t = v + powerOfTen * digit;
    res.add(Z.valueOf(t));
    if (digit < 9) {
      build(res, v, digit + 1, powerOfTen * 10);
      build(res, t, digit + 1, powerOfTen * 10);
    }
  }

  /** Construct the sequence. */
  public A063013() {
    super(build());
  }
}
