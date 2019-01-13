package irvine.factor.prover;

import irvine.math.z.Z;
import irvine.util.string.Date;

/**
 * Default implementation for handling long inputs.
 * @author Sean A. Irvine
 */
public abstract class AbstractProver implements Prover {

  private boolean mVerbose = false;

  @Override
  public PrimeStatus isPrime(final long n) {
    return isPrime(Z.valueOf(n));
  }

  @Override
  public void setVerbose(final boolean verbose) {
    mVerbose = verbose;
  }

  @Override
  public boolean isVerbose() {
    return mVerbose;
  }

  @Override
  public void message(final String message) {
    if (isVerbose()) {
      System.err.println(Date.now() + message);
    }
  }
}
