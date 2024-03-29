package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311336 Coordination sequence Gal.5.233.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311336 extends TilingSequence {

  /** Construct the sequence. */
  public A311336() {
    super(0, new String[]
        { "6.6.3.3;B300+3,A180+2,C60+1,C240+4"
        , "6.6.3.3;D60+2,E180+2,A60+1,C300+3"
        , "6.3.3.3.3;A300+3,D120+3,B60+4,A120+4,C180+5"
        , "6.3.6.3;E300+3,B300+1,C240+2,E120+1"
        , "6.6.3.3;D240+4,B180+2,D60+1,E180+4"
        });
    defineBaseSet(0);
  }
}
