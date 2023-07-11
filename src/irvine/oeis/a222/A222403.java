package irvine.oeis.a222;
// manually wraptr1 at 2021-11-13

import irvine.oeis.a000.A000217;
import irvine.oeis.triangle.WrappedRecurrence;

/**
 * A222403 Triangle read by rows: left and right edges are A000217, interior entries are filled in using the Pascal triangle rule.
 * @author Georg Fischer
 */
public class A222403 extends WrappedRecurrence {

  /** Construct the sequence. */
  public A222403() {
    super(0, new A000217());
  }
}
