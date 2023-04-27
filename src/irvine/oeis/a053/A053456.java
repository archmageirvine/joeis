package irvine.oeis.a053;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a036.A036704;
import irvine.oeis.a051.A051132;

/**
 * A053456 Open disk numbers (version 1): a(n) is the number of points (i,j), i,j, integers, contained in an open disk of diameter n, centered at (0,0).
 * @author Sean A. Irvine
 */
public class A053456 extends AlternatingSequence {

  /** Construct the sequence. */
  public A053456() {
    super(0, new A051132(), new A036704());
  }
}

