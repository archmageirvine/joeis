package irvine.oeis.a078;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A078555 Number of balanced numbers &gt; 2^(n-1) and &lt;= 2^n.
 * @author Sean A. Irvine
 */
public class A078555 extends DifferenceSequence {

  /** Construct the sequence. */
  public A078555() {
    super(0, new PrependSequence(new A078662(), 0));
  }
}

