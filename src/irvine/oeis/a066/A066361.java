package irvine.oeis.a066;

import irvine.math.cr.CR;
import irvine.math.q.Q;

/**
 * A066361 The floor(n^(.9999))-perfect numbers, where f-perfect numbers for an arithmetical function f is defined in A066218.
 * @author Sean A. Irvine
 */
public class A066361 extends A066367 {

  private static final CR POW = CR.valueOf(new Q(9999, 10000));

  /** Construct the sequence. */
  public A066361() {
    super(k -> CR.valueOf(k).pow(POW).floor().longValueExact());
  }
}
