package irvine.oeis.a222;
// manually wraptr1 at 2021-11-13

import irvine.oeis.a002.A002061;
import irvine.oeis.triangle.WrappedRecurrence;

/**
 * A222405 Triangle read by rows: left and right edges are A002061 (1,3,7,13,21,...), interior entries are filled in using the Pascal triangle rule.
 * @author Georg Fischer
 */
public class A222405 extends WrappedRecurrence {

  /** Construct the sequence. */
  public A222405() {
    super(0, new A002061());
    skipLeft(1);
  }
}
