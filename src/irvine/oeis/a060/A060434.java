package irvine.oeis.a060;

import irvine.oeis.PrependSequence;
import irvine.oeis.a051.A051402;

/**
 * A060434 An inverse to Mertens's function: smallest k &gt;= 2 such that Mertens's function |M(k)| (see A002321) is equal to n.
 * @author Sean A. Irvine
 */
public class A060434 extends PrependSequence {

  /** Construct the sequence. */
  public A060434() {
    super(new A051402().skip(1), 2, 3);
  }
}

