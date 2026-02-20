package irvine.oeis.a385;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a229.A229939;

/**
 * A385994 Lexicographically greatest increasing expansion Pi = Sum_{n&gt;=0} a(n)/10^n, where a(n+1) &gt;= a(n).
 * @author Sean A. Irvine
 */
public class A385994 extends PartialSumSequence {

  /** Construct the sequence. */
  public A385994() {
    super(0, new A229939());
  }
}

