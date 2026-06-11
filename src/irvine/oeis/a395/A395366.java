package irvine.oeis.a395;

/**
 * A395366 Walk along the hexagonal spiral, with its cells numbered starting at 0, as in A395362. Two players, Black and Red, take turns. When it is Black's turn, he places a knight at the smallest unoccupied cell not attacked by an existing Red knight, and when it is Red's turn, she places a knight at the smallest unoccupied cell not attacked by an existing Black knight. Sequence lists cells occupied by Red knights.
 * @author Sean A. Irvine
 */
public class A395366 extends A395365 {

  /** Construct the sequence. */
  public A395366() {
    super(2, 1);
  }
}
