package irvine.oeis.a285;

import chesspresso.position.Position;
import irvine.oeis.a048.A048987;

/**
 * A285873.
 * @author Sean A. Irvine
 */
public class A285873 extends A048987 {

  @Override
  protected Position start() {
    return new Position("rnb1kbnr/pppppppp/8/8/8/8/PPPPPPPP/RNB1KBNR w KQkq - 0 1", true);
  }
}

