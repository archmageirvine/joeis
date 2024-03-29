package irvine.oeis.a129;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: 2/(1-2*x)^2-1/((1-2*x)*sqrt(1-2*x))
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A129890 a(n) = (2*n+2)!! - (2*n+1)!!.
 * @author Georg Fischer
 */
public class A129890 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A129890() {
    super(0, "[[0],[12,14,4],[-9,-13,-4],[2,3,1]]", "[1,5,33,279]", 2);
    setGfType(1);
  }
}
