package irvine.oeis.a073;

import irvine.oeis.PrependSequence;
import irvine.oeis.a070.A070865;

/**
 * A073828.
 * @author Sean A. Irvine
 */
public class A073847 extends PrependSequence {

  /** Construct the sequence. */
  public A073847() {
    super(0, new A070865().skip(2), 1);
  }
}
