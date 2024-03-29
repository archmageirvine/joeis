package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311755 Coordination sequence Gal.5.235.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311755 extends TilingSequence {

  /** Construct the sequence. */
  public A311755() {
    super(0, new String[]
        { "6.6.3.3;B300+3,B180+2,C60+1,D180+5"
        , "6.6.3.3;D60+2,A180+2,A60+1,D240+4"
        , "6.3.6.3;A300+3,E300+1,E240+2,D120+1"
        , "6.3.3.3.3;C240+4,B300+1,D180+3,B120+4,A180+4"
        , "6.3.6.3;C60+2,C120+3,E60+4,E300+3"
        });
    defineBaseSet(0);
  }
}
