package irvine.oeis.a070;
// Generated by gen_seq4.pl 2024-04-22/multrar at 2024-04-22 22:28

import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A070823 a(1)=0, a(1)=1, a(n+2)=abs(concatenate(a(n+1)a(n))-concatenate(a(n)a(n+1))).
 * @author Georg Fischer
 */
public class A070823 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A070823() {
    super(1, (self, n) -> {
      final String s1 = self.a(n - 1).toString();
      final String s2 = self.a(n - 2).toString();
      return new Z(s1 + s2).subtract(new Z(s2 + s1)).abs();
    }, "0, 1");
  }
}
