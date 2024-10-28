package irvine.math.cr;

/**
 * Log gamma function
 * @author Sean A. Irvine
 */
public class LnGamma extends UnaryCrFunction {

  @Override
  public CR execute(final CR x) {
    return x.lnGamma();
  }
}
