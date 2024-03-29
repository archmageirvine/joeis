package irvine.oeis.a117;
// Generated by gen_seq4.pl knest at 2023-03-02 20:46

import irvine.math.z.Z;
import irvine.oeis.a016.A016041;

/**
 * A117697 Palindromic primes in base 2 (written in base 2).
 * @author Georg Fischer
 */
public class A117697 extends A016041 {
  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}
