package irvine.oeis.a035;

import irvine.oeis.WeighTransformSequence;
import irvine.oeis.a007.A007561;

/**
 * A035079 Weigh transform of A007561.
 * @author Sean A. Irvine
 */
public class A035079 extends WeighTransformSequence {

  /** Construct the sequence. */
  public A035079() {
    super(new A007561());
  }
}
