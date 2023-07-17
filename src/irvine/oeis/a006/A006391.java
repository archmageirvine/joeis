package irvine.oeis.a006;

/**
 * A006391 Number of unsensed planar maps with n edges and without loops.
 * @author Sean A. Irvine
 */
public class A006391 extends A006385 {

  /** Construct the sequence. */
  public A006391() {
    super(1);
  }

  {
    next();
  }

  static boolean hasLoop(final int e, final int[] s) {
    for (int k = 1; k <= 2 * e; ++k) {
      if (s[k] == OPEN_BRACKET) {
        int bopen = 1;
        int popen = 0;
        for (int j = k + 1; j <= 2 * e; ++j) {
          if (s[j] == CLOSE_BRACKET && --bopen == 0) {
            if (popen == 0) {
              return true;
            } else {
              break;
            }
          } else if (s[j] == OPEN_PAREN) {
            ++popen;
          } else if (s[j] == OPEN_BRACKET) {
            ++bopen;
          } else if (s[j] == CLOSE_PAREN && --popen < 0) {
            break;
          }
        }
      }
    }
    return false;
  }
  @Override
  protected boolean reject(final int e) {
    return hasLoop(e, mS);
  }
}
