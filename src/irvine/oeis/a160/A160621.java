package irvine.oeis.a160;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.HolonomicRecurrence;

/**
 * A160621 Numerator of Laguerre(n, 1).
 * Superclass for similiar sequences.
 * The general holonomic recurrence for Laguerre(n,r) is the fraction
 * <pre>
 * Numerator:   a(n) + (-2*n+r+1)*a(n-1) + (n-1)^2*a(n-2)=0
 * -------------------------------------------------------
 * Denominator: n! 
 * </pre>
 * The recurrence parameter is [[0],[1,-2, 1],[r+1,-2],[1]].
 * @author Georg Fischer
 */
public class A160621 extends HolonomicRecurrence {
    
  protected boolean mNumer; // true for numerators, false for denominators
  protected Z mFactorial; // maintain n! here
  protected int mN; // current index

  /** Construct the sequence. */
  public A160621() {
    this(true, 1);
  }
  
  /**
   * Constructor with parameters
   * @param numer true if the numerator should be returned, false for the denominator
   * @param r evaluate the Laguerre(n) polynomial for this value
   */
  public A160621(final boolean numer, final long r) {
    super(0, // all these sequences start with offset 0
        "[[0],[1,-2, 1],[" + (r + 1) + ",-2],[1]]", "", 0);
    mN = 0;
    mNumer = numer;
    mFactorial = Z.ONE;
  }

  @Override
  public Z next() {
    final Q result = new Q(super.next(), mFactorial);
    mFactorial = mFactorial.multiply(++mN);
    return mNumer ? result.num() : result.den();
  }
}

