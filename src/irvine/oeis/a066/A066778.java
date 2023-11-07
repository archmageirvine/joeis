package irvine.oeis.a066;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002379;

/**
 * A066778 a(n) = Sum_{i=1..n} floor((3/2)^i).
 * @author Sean A. Irvine
 */
public class A066778 extends PartialSumSequence {

  /** Construct the sequence. */
  public A066778() {
    super(1, new A002379().skip());
  }
}

