package irvine.math.cr;

import java.util.ArrayList;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * Continued fraction convergents.
 * @author Sean A. Irvine
 */
public class Convergents extends AbstractIterator<Q> {
  
  private final int mAccuracy;
  private CR mX;
  private Z mH0 = Z.ZERO;
  private Z mH1 = Z.ONE;
  private Z mK0 = Z.ONE;
  private Z mK1 = Z.ZERO;
  private Z mA = null;
  private boolean mMoreTerms = true;
  
  
  /**
   * Continued fraction convergents iterator.
   * @param x number to get convergents for
   * @param accuracy how careful when taking the floor
   */
  public Convergents(final CR x, final int accuracy) {
    mX = x;
    mAccuracy = accuracy;
  }

  /**
   * Continued fraction convergents iterator.
   * @param x number to get convergents for
   */
  public Convergents(final CR x) {
    this(x, 500);
  }

  @Override
  public boolean hasNext() {
    return mMoreTerms;
  }
  
  private Z a() {
    final Z res = mX.floor(mAccuracy);
    final CR cres = CR.valueOf(res);
    if (mX.compareTo(cres, -mAccuracy) == 0) {
      mMoreTerms = false;
    } else {
      mX = mX.subtract(cres).inverse();
    }
    return res;
  }

  /**
   * Return the continued fraction term for the current iteration.
   * @return continued fraction value
   */
  public Z frac() {
    return mA;
  }

  @Override
  public Q next() {
    mA = a();
    //System.out.println("a was " + a);
    final Z h = mA.multiply(mH1).add(mH0);
    final Z k = mA.multiply(mK1).add(mK0);
    mH0 = mH1;
    mH1 = h;
    mK0 = mK1;
    mK1 = k;
    return new Q(h, k);
  }

  /**
   * Return the convergents of the continued fraction for <code>sqrt(d)</code>.
   * @param d the value to get convergents for
   * @return convergents
   */
  public static List<Z> continuedFractionConvergentsSqrt(final long d) {
    final List<Z> cf = new ArrayList<>();
    final Convergents conv = new Convergents(CR.valueOf(d).sqrt());
    conv.next();
    Z t = conv.frac();
    cf.add(t);
    final Z end = t.multiply2();
    do {
      conv.next();
      t = conv.frac();
      cf.add(t);
    } while (!end.equals(t));
    return cf;
  }
}

