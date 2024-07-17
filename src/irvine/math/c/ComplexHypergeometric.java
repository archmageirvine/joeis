package irvine.math.c;

import irvine.math.generic.Buchholz1F1;
import irvine.math.generic.TaylorSeries0F1;
import irvine.math.generic.TaylorSeries1F1;

/**
 * Implementation of hypergeometric functions for complex numbers.
 * @author Sean A. Irvine
 */
public final class ComplexHypergeometric {

  private ComplexHypergeometric() { }

  static C hypergeometric(final C[] upperParameters, final C[] lowerParameters, final C z) {
    switch (upperParameters.length) {
      case 0:
        switch (lowerParameters.length) {
          case 0:
            return ComplexField.SINGLETON.exp(z);
          case 1:
            return TaylorSeries0F1.hypergeometric(ComplexField.SINGLETON, lowerParameters[0], z);
          default:
            break;
        }
        break;
      case 1:
        switch (lowerParameters.length) {
          case 1:
            return hypergeometric(upperParameters[0], lowerParameters[0], z);
          default:
            break;
        }
        break;
      default:
        break;
    }
    throw new UnsupportedOperationException(upperParameters.length + "F" + lowerParameters.length + " unsupported");
  }

  static C hypergeometric(final C a, final C b, final C z) {
    if (a.re() * z.re() < 0 && ComplexField.SINGLETON.abs(z) < 50 && ComplexField.SINGLETON.abs(a) < 50 && ComplexField.SINGLETON.abs(b) < 50) {
      final C buchholz = Buchholz1F1.hypergeometric(ComplexField.SINGLETON, a, b, z);
      if (buchholz != null) {
        return buchholz;
      }
    }
    final C taylor = TaylorSeries1F1.hypergeometric(ComplexField.SINGLETON, a, b, z);
    if (taylor != null) {
      return taylor;
    }
    throw new UnsupportedOperationException();
  }
}
