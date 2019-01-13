package irvine.oeis.a003;

/**
 * A003042.
 * @author Sean A. Irvine
 */
public class A003042 extends A003043 {

  @Override
  protected boolean filter(final int lastUsed) {
    return (lastUsed & (lastUsed - 1)) == 0;
  }
}
