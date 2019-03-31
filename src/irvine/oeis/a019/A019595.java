package irvine.oeis.a019;

/**
 * A019595.
 * @author Sean A. Irvine
 */
public class A019595 extends A019592 {

  @Override
  protected long step(final long position) {
    return mNextPosition.get(mNextPosition.get(mNextPosition.get(mNextPosition.get(mNextPosition.get(position)))));
  }
}
