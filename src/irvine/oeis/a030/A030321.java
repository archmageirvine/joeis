package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.transform.RunLengthTransform;

/**
 * A030321 Duplicate of A030305.
 * @author Sean A. Irvine
 */
public class A030321 extends RunLengthTransform {

  /** Construct the sequence. */
  public A030321() {
    super(1, new A030317());
  }

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}

