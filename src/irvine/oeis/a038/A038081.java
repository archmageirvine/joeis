package irvine.oeis.a038;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a014.A014221;

/**
 * A038081 Number of rooted identity trees of height n. Sets of rank n.
 * @author Sean A. Irvine
 */
public class A038081 extends DifferenceSequence {

  /** Construct the sequence. */
  public A038081() {
    super(new A014221());
  }
}
