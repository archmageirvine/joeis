package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311870 Coordination sequence Gal.6.436.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311870 extends TilingSequence {

  /** Construct the sequence. */
  public A311870() {
    super(0, new String[]
        { "6.4.4.3;B240+4,A60-2,C240-3,A60-4"
        , "6.3.6.3;A180-1,A300+1,A0-1,A120+1"
        , "6.4.4.3;D180-1,C60-2,A240-3,C60-4"
        , "6.3.6.3;C180-1,E300+1,E0-1,C120+1"
        , "6.3.6.3;D60+2,E60-2,F240+2,E60-4"
        , "6.3.6.3;E0-3,E120+3,E180-3,E300+3"
        });
    defineBaseSet(0);
  }
}
