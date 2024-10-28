package irvine.math.cr;

/**
 * Arccotangent function
 * @author Georg Fischer
 */
class Acot extends UnaryCrFunction {

  @Override
  public CR execute(final CR x) {
    return CR.HALF_PI.subtract(((UnaryCrFunction) new Atan()).execute(x));
  }
}
