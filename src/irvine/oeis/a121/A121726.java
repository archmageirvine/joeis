package irvine.oeis.a121;
// manually 2021-01-21

import irvine.oeis.AddConstantSequence;
import irvine.oeis.a006.A006231;

/**
 * A121726 Sum sequence A000522 then subtract 0,1,2,3,4,5,...
 *
 * @author Georg Fischer
 */
public class A121726 extends AddConstantSequence {

  /**
   * Construct the sequence.
   */
  public A121726() {
    super(1, new A006231());
  }
}
