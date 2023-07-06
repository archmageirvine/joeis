package irvine.oeis.a060;

import irvine.oeis.PrependSequence;
import irvine.oeis.a057.A057983;

/**
 * A060751 These numbers take a record number of steps to reach the top of the deck in Guy's shuffle (see A060750).
 * @author Sean A. Irvine
 */
public class A060751 extends PrependSequence {

  /** Construct the sequence. */
  public A060751() {
    super(new A057983().skip(3), 1);
  }
}
