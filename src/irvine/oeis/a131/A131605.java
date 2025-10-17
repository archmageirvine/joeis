package irvine.oeis.a131;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a001.A001597;
import irvine.oeis.a246.A246547;

/**
 * A131605 Perfect powers of nonprimes (m^k where m is a nonprime positive integer and k &gt;= 2).
 * @author Sean A. Irvine
 */
public class A131605 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A131605() {
    super(1, new A001597(), new A246547());
  }
}
