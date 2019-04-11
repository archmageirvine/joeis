package irvine.oeis.a018;

import irvine.oeis.FiniteSequence;

/**
 * A018895 Weight distribution of <code>[ 512,130,64 ]</code> third-order Reed-Muller code.
 * @author Sean A. Irvine
 */
public class A018895 extends FiniteSequence {

  /** Construct the sequence. */
  public A018895() {
    super(A018188.suckInNumbers("irvine/oeis/a018/a018895.dat.gz"));
  }
}

