package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000316 Two decks each have n kinds of cards, 2 of each kind. The first deck is laid out in order. The second deck is shuffled and laid out next to the first. A match occurs if a card from the second deck is next to a card of the same kind from the first deck. a(n) is the number of ways of achieving no matches.
 * @author Sean A. Irvine
 */
public class A000316 extends A000459 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().shiftLeft(mN);
  }
}
