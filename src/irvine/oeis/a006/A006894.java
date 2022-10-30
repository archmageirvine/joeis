package irvine.oeis.a006;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002658;

/**
 * A006894 Number of planted 3-trees of height &lt; n.
 * @author Sean A. Irvine
 */
public class A006894 extends PartialSumSequence {

  /** Construct the sequence. */
  public A006894() {
    super(1, new A002658());
  }
}
