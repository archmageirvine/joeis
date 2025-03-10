package irvine.oeis.a054;
// Generated by gen_seq4.pl 2024-10-15.ack/lambdan at 2024-10-15 22:29

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A054752 Number of inequivalent n X n matrices over GF(5) under action of dihedral group of the square D_4.
 * @author Georg Fischer
 */
public class A054752 extends LambdaSequence {

  /** Construct the sequence. */
  public A054752() {
    super(0, n -> {
      final int k = 5;
      final long n2 = (long) n * n;
      return Z.valueOf(k).pow(n2).add(Z.valueOf(k).pow((n2 + 3 * (n & 1)) / 4).multiply(2)).add(Z.valueOf(k).pow((n2 + (n % 2)) / 2)).add(Z.valueOf(k).pow((long) n * (n + 1) / 2).multiply(2)).add(Z.valueOf(k).pow((long) n * (n + (n & 1)) / 2).multiply(2)).divide(8);
    });
  }
}
