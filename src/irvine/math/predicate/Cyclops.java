package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is a Cyclops number (see A134808).
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class Cyclops extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    final String s = n.toString();
    final int l = s.length();
    if ((l & 1) == 0) {
      return false;
    }
    if (s.charAt(l / 2) != '0') {
      return false;
    }
    for (int k = 1; k < l / 2; ++k) {
      if (s.charAt(k) == '0') {
        return false;
      }
    }
    for (int k = l / 2 + 1; k < l; ++k) {
      if (s.charAt(k) == '0') {
        return false;
      }
    }
    return true;
  }

}
