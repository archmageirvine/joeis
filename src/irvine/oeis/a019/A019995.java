package irvine.oeis.a019;

/**
 * A019995.
 * @author Sean A. Irvine
 */
public class A019995 extends A019993 {

  @Override
  protected long step(final long position) {
    return mNextPosition.get(super.step(position));
  }
}
