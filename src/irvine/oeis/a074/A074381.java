package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A074381 (p-1)/2 mod 2, where p is the n-th prime for which p+2 is also prime; i.e., a(n)=0 if p==1 (mod 4), a(n)=1 if p==3 (mod 4).
 * @author Sean A. Irvine
 */
public class A074381 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A074381() {
    super(1, new A001359(), p -> p.divide2().and(Z.ONE));
  }
}
