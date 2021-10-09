package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A051021 Decimal expansion of Mills's constant, assuming the Riemann Hypothesis is true.
 * @author Sean A. Irvine
 */
public class A051021 extends DecimalExpansionSequence {

  private static final int TERMS = 5; // good for 250 terms
  // A value of 7 ok for 10000 terms

  private static CR create() {
    // After Robert G. Wilson, v.
    final Fast prime = new Fast();
    Z p = Z.TWO;
    for (int k = 0; k < TERMS; ++k) {
      p = prime.nextPrime(p.pow(3));
    }
    return CR.valueOf(p).pow(CR.THREE.pow(TERMS + 1).inverse());
  }

  /** Construct the sequence. */
  public A051021() {
    super(create());
  }

  @Override
  public Z next() {
    if (mN > 250) {
      throw new UnsupportedOperationException();
    }
    return super.next();
  }
}

