package irvine.math.cr;

/**
 * Arccotangent function
 * @author Georg Fischer
 */
class Acot extends UnaryCRFunction {

  @Override
  public CR execute(final CR x) {
    return CR.HALF_PI.subtract(ATAN.execute(x));
  }
}
