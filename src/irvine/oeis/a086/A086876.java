package irvine.oeis.a086;

import irvine.oeis.a071.A071542;
import irvine.oeis.transform.RunLengthTransform;

/**
 * A086876 Run lengths in A071542.
 * @author Sean A. Irvine
 */
public class A086876 extends RunLengthTransform {

  /** Construct the sequence. */
  public A086876() {
    super(0, new A071542());
  }
}
