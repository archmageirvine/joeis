package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A057077 Periodic sequence 1,1,-1,-1; expansion of (1+x)/(1+x^2).
 * @author Sean A. Irvine
 */
public class A057077 extends LambdaSequence {

  /** Construct the sequence. */
  public A057077() {
    super(0, n -> (n & 2) == 0 ? Z.ONE : Z.NEG_ONE);
  }

}
