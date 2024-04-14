package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A034590 Decimal part of square root of 'nine digits anagram' starts with a 'nine digits anagram'.
 * @author Sean A. Irvine
 */
public class A034590 extends Sequence1 {

  private static final CR C = CR.valueOf(1000000000);
  private final Permutation mPermutation = new Permutation(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});

  @Override
  public Z next() {
    while (true) {
      final int[] p = mPermutation.next();
      if (p == null) {
        return null; // Sequence is finite
      }
      long a = 0;
      for (final int i : p) {
        a *= 10;
        a += i;
      }
      if (Functions.SYNDROME.i(CR.valueOf(a).sqrt().frac().multiply(C).floor()) == 0b1111111110) {
        return Z.valueOf(a);
      }
    }
  }
}
