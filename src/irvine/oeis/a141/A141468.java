package irvine.oeis.a141;

import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002808;

/**
 * A141468 Zero together with the nonprime numbers <code>A018252</code>.
 * @author Sean A. Irvine
 */
public class A141468 extends PrependSequence {

  /** Construct the sequence. */
  public A141468() {
    super(new A002808(), 0, 1);
  }
}
