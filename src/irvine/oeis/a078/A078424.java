package irvine.oeis.a078;

import irvine.oeis.InterleaveSequence;
import irvine.oeis.a000.A000796;
import irvine.oeis.a001.A001113;
import irvine.oeis.a001.A001622;

/**
 * A078396.
 * @author Sean A. Irvine
 */
public class A078424 extends InterleaveSequence {

  /** Construct the sequence. */
  public A078424() {
    super(1, new A000796(), new A001113(), new A001622());
  }
}

