package irvine.oeis.a019;

/**
 * A019997 From George Gilbert's marks problem: jumping 7 marks at a time <code>(initial positions)</code>.
 * @author Sean A. Irvine
 */
public class A019997 extends A019995 {

  @Override
  protected long step(final long position) {
    return mNextPosition.get(super.step(position));
  }
}
