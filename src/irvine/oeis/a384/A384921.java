package irvine.oeis.a384;

import irvine.oeis.Combiner;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002464;
import irvine.oeis.a002.A002493;

/**
 * A384921 allocated for Wolfdieter Lang.
 * @author Sean A. Irvine
 */
public class A384921 extends PrependSequence {

  /** Construct the sequence. */
  public A384921() {
    super(1, new Combiner(new A002464().skip(2), new A002493().skip(), Combiner.SUBTRACT), 1);
  }
}

