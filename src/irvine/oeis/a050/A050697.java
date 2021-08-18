package irvine.oeis.a050;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a035.A035140;

/**
 * A050697 Numbers that appear in A035140 but not in A050694.
 * @author Sean A. Irvine
 */
public class A050697 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A050697() {
    super(new A035140(), new A050694());
  }
}
