package irvine.oeis.a081;

import irvine.oeis.InverseSequence;

/**
 * A081356 Least m such that A081355(m)=LD(m,m^2)=n, where LD(x,y) denotes the Levenshtein distance between x and y in decimal representation.
 * @author Sean A. Irvine
 */
public class A081356 extends InverseSequence {

  /** Construct the sequence. */
  public A081356() {
    super(0, 0, new A081355());
  }
}

