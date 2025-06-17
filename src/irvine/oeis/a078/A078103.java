package irvine.oeis.a078;

import irvine.oeis.PrependSequence;
import irvine.oeis.a076.A076863;

/**
 * A078103 Number of maximal independent generating sets for S_n.
 * @author Sean A. Irvine
 */
public class A078103 extends PrependSequence {

  /** Construct the sequence. */
  public A078103() {
    super(1, new A076863().skip(6), 1, 1, 6, 94, 285, 6342);
  }
}

