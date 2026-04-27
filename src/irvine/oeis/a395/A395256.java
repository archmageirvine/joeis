package irvine.oeis.a395;

import irvine.oeis.Combiner;
import irvine.oeis.a001.A001035;
import irvine.oeis.a006.A006905;

/**
 * A395256 Number of transitive relations that are not posets.
 * @author Sean A. Irvine
 */
public class A395256 extends Combiner {

  /** Construct the sequence. */
  public A395256() {
    super(0, new A006905(), new A001035(), SUBTRACT);
  }
}
