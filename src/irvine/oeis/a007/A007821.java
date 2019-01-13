package irvine.oeis.a007;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a006.A006450;

/**
 * A007821.
 * @author Sean A. Irvine
 */
public class A007821 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A007821() {
    super(new A000040(), new A006450());
  }
}
