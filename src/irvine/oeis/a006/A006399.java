package irvine.oeis.a006;

/**
 * A006399.
 * @author Sean A. Irvine
 */
public class A006399 extends A006391 {

  {
    next();
  }

  static boolean hasIsthmus(final int e, final int[] s) {
    for (int k = 1; k < 2 * e; ++k) {
      if (s[k] == OPEN_PAREN) {
        int popen = 1;
        int bopen = 0;
        for (int j = k + 1; j <= 2 * e; ++j) {
          if (s[j] == CLOSE_PAREN && --popen == 0) {
            if (bopen == 0) {
              return true;
            } else {
              break;
            }
          } else if (s[j] == OPEN_BRACKET) {
            ++bopen;
          } else if (s[j] == OPEN_PAREN) {
            ++popen;
          } else if (s[j] == CLOSE_BRACKET && --bopen < 0) {
            break;
          }
        }
      }
    }
    return false;
  }

  @Override
  protected boolean reject(final int e) {
    return super.reject(e) || hasIsthmus(e, mS);
  }

}
