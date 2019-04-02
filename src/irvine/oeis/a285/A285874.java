package irvine.oeis.a285;

import chesspresso.position.Position;
import irvine.oeis.a048.A048987;

/**
 * A285874 Number of possible chess games at the end of the n-th ply starting without rooks.
 * @author Sean A. Irvine
 */
public class A285874 extends A048987 {

  @Override
  protected Position start() {
    return new Position("1nbqkbn1/pppppppp/8/8/8/8/PPPPPPPP/1NBQKBN1 w - - 0 1", true);
  }
}

